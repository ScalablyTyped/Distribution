package typings.electronNotarize

import typings.electronNotarize.electronNotarizeInts.`0`
import typings.electronNotarize.electronNotarizeInts.`2`
import typings.electronNotarize.electronNotarizeStrings.`in progress`
import typings.electronNotarize.electronNotarizeStrings.invalid
import typings.electronNotarize.electronNotarizeStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpersMod {
  
  @JSImport("@electron/notarize/lib/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def delay(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def isSecret(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSecret")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def makeSecret(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSecret")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseNotarizationInfo(info: String): NotarizationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNotarizationInfo")(info.asInstanceOf[js.Any]).asInstanceOf[NotarizationInfo]
  
  inline def withTempDir[T](fn: js.Function1[/* dir */ String, js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTempDir")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  trait NotarizationInfo extends StObject {
    
    var date: js.Date
    
    var logFileUrl: String | Null
    
    var status: invalid | (`in progress`) | success
    
    var statusCode: js.UndefOr[`0` | `2`] = js.undefined
    
    var statusMessage: js.UndefOr[String] = js.undefined
    
    var uuid: String
  }
  object NotarizationInfo {
    
    inline def apply(date: js.Date, status: invalid | (`in progress`) | success, uuid: String): NotarizationInfo = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], logFileUrl = null)
      __obj.asInstanceOf[NotarizationInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotarizationInfo] (val x: Self) extends AnyVal {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setLogFileUrl(value: String): Self = StObject.set(x, "logFileUrl", value.asInstanceOf[js.Any])
      
      inline def setLogFileUrlNull: Self = StObject.set(x, "logFileUrl", null)
      
      inline def setStatus(value: invalid | (`in progress`) | success): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: `0` | `2`): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
}
