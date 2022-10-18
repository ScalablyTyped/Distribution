package typings.expoPackageManager

import typings.expoPackageManager.buildPackageManagerMod.Logger
import typings.expoSpawnAsync.mod.SpawnOptions
import typings.ora.mod.Ora
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    }
  }
  
  trait Cwd extends StObject {
    
    var cwd: String
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object Cwd {
    
    inline def apply(cwd: String): Cwd = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cwd]
    }
    
    extension [Self <: Cwd](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  trait Error extends StObject {
    
    var error: Any
    
    var shouldUpdate: js.UndefOr[Boolean] = js.undefined
    
    var spinner: js.UndefOr[Ora] = js.undefined
    
    var updatedPackages: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Error {
    
    inline def apply(error: Any): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setShouldUpdate(value: Boolean): Self = StObject.set(x, "shouldUpdate", value.asInstanceOf[js.Any])
      
      inline def setShouldUpdateUndefined: Self = StObject.set(x, "shouldUpdate", js.undefined)
      
      inline def setSpinner(value: Ora): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      inline def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
      
      inline def setUpdatedPackages(value: js.Array[String]): Self = StObject.set(x, "updatedPackages", value.asInstanceOf[js.Any])
      
      inline def setUpdatedPackagesUndefined: Self = StObject.set(x, "updatedPackages", js.undefined)
      
      inline def setUpdatedPackagesVarargs(value: String*): Self = StObject.set(x, "updatedPackages", js.Array(value*))
    }
  }
  
  trait Log extends StObject {
    
    var cwd: String
    
    var log: js.UndefOr[Logger] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object Log {
    
    inline def apply(cwd: String): Log = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
      __obj.asInstanceOf[Log]
    }
    
    extension [Self <: Log](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setLog(value: Logger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  trait Message extends StObject {
    
    var message: String
    
    var shouldUpdateRepo: Boolean
    
    var updatePackage: String | Null
  }
  object Message {
    
    inline def apply(message: String, shouldUpdateRepo: Boolean): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], shouldUpdateRepo = shouldUpdateRepo.asInstanceOf[js.Any], updatePackage = null)
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setShouldUpdateRepo(value: Boolean): Self = StObject.set(x, "shouldUpdateRepo", value.asInstanceOf[js.Any])
      
      inline def setUpdatePackage(value: String): Self = StObject.set(x, "updatePackage", value.asInstanceOf[js.Any])
      
      inline def setUpdatePackageNull: Self = StObject.set(x, "updatePackage", null)
    }
  }
  
  trait NonInteractive extends StObject {
    
    var nonInteractive: js.UndefOr[Boolean] = js.undefined
    
    var spawnOptions: js.UndefOr[SpawnOptions] = js.undefined
  }
  object NonInteractive {
    
    inline def apply(): NonInteractive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NonInteractive]
    }
    
    extension [Self <: NonInteractive](x: Self) {
      
      inline def setNonInteractive(value: Boolean): Self = StObject.set(x, "nonInteractive", value.asInstanceOf[js.Any])
      
      inline def setNonInteractiveUndefined: Self = StObject.set(x, "nonInteractive", js.undefined)
      
      inline def setSpawnOptions(value: SpawnOptions): Self = StObject.set(x, "spawnOptions", value.asInstanceOf[js.Any])
      
      inline def setSpawnOptionsUndefined: Self = StObject.set(x, "spawnOptions", js.undefined)
    }
  }
  
  trait ShouldUpdateRepo extends StObject {
    
    var shouldUpdateRepo: Boolean
    
    var updatePackage: String | Null
  }
  object ShouldUpdateRepo {
    
    inline def apply(shouldUpdateRepo: Boolean): ShouldUpdateRepo = {
      val __obj = js.Dynamic.literal(shouldUpdateRepo = shouldUpdateRepo.asInstanceOf[js.Any], updatePackage = null)
      __obj.asInstanceOf[ShouldUpdateRepo]
    }
    
    extension [Self <: ShouldUpdateRepo](x: Self) {
      
      inline def setShouldUpdateRepo(value: Boolean): Self = StObject.set(x, "shouldUpdateRepo", value.asInstanceOf[js.Any])
      
      inline def setUpdatePackage(value: String): Self = StObject.set(x, "updatePackage", value.asInstanceOf[js.Any])
      
      inline def setUpdatePackageNull: Self = StObject.set(x, "updatePackage", null)
    }
  }
  
  trait Spinner extends StObject {
    
    var spinner: js.UndefOr[Ora] = js.undefined
  }
  object Spinner {
    
    inline def apply(): Spinner = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Spinner]
    }
    
    extension [Self <: Spinner](x: Self) {
      
      inline def setSpinner(value: Ora): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      inline def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
    }
  }
}
