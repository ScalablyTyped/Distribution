package typings.diskspace

import typings.diskspace.diskspaceStrings.NOTFOUND
import typings.diskspace.diskspaceStrings.NOTREADY
import typings.diskspace.diskspaceStrings.READY
import typings.diskspace.diskspaceStrings.STDERR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("diskspace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def check[T /* <: String */](drive: T, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(drive.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Callback = js.Function2[/* err */ js.Error | Null, /* result */ Result, Unit]
  
  trait Result extends StObject {
    
    /**
      * RU: Это то, сколько свободного места у вас есть.
      *
      * EN: Is how much free space you have.
      */
    var free: String
    
    /**
      * RU:
      *
      * На самом деле не так полезен, если вы не хотите отлаживать.
      * * NOTFOUND - Диск не найден, значения пространства будут 0
      * * READY - Диск готов
      * * NOTREADY - Диск не готов, значения пространства будут 0
      * * STDERR - некоторая ошибка, вывод ее был записан на консоль.
      *
      * EN:
      *
      * Isn't really that useful unless you want to debug.
      * * NOTFOUND - Disk was not found, the space values will be 0
      * * READY - The drive is ready
      * * NOTREADY - The drive isn't ready, the space values will be 0
      * * STDERR - some error, the output of it was logged to the console.
      */
    var status: NOTFOUND | READY | NOTREADY | STDERR
    
    /**
      * RU: Это то, сколько диск имеет полностью.
      *
      * EN: Is how much the drive has totally.
      */
    var total: String
    
    /**
      * RU:
      *
      * Это указанная часть диска как используемая.
      * На *nix это прямо из команды, в Windows это вычисляется из `df -kresult.total - result.free`
      *
      * EN:
      *
      * Is how much of the drive is reported as used.
      * On *nix this is straight from the command, on Windows it's calculated from `df -kresult.total - result.free`
      */
    var used: Double
  }
  object Result {
    
    inline def apply(free: String, status: NOTFOUND | READY | NOTREADY | STDERR, total: String, used: Double): Result = {
      val __obj = js.Dynamic.literal(free = free.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setFree(value: String): Self = StObject.set(x, "free", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: NOTFOUND | READY | NOTREADY | STDERR): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setUsed(value: Double): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    }
  }
}
