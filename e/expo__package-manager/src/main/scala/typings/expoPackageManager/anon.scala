package typings.expoPackageManager

import typings.expoPackageManager.buildPackageManagerMod.Logger
import typings.expoSpawnAsync.mod.SpawnOptions
import typings.node.nodeColonurlMod.URL
import typings.ora.mod.Ora
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cwd extends StObject {
    
    var cwd: String
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object Cwd {
    
    inline def apply(cwd: String): Cwd = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cwd]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cwd] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NonInteractive] (val x: Self) extends AnyVal {
      
      inline def setNonInteractive(value: Boolean): Self = StObject.set(x, "nonInteractive", value.asInstanceOf[js.Any])
      
      inline def setNonInteractiveUndefined: Self = StObject.set(x, "nonInteractive", js.undefined)
      
      inline def setSpawnOptions(value: SpawnOptions): Self = StObject.set(x, "spawnOptions", value.asInstanceOf[js.Any])
      
      inline def setSpawnOptionsUndefined: Self = StObject.set(x, "spawnOptions", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@expo/spawn-async.@expo/spawn-async.SpawnOptions, 'cwd'> */
  trait PickSpawnOptionscwd extends StObject {
    
    var cwd: js.UndefOr[String | URL] = js.undefined
  }
  object PickSpawnOptionscwd {
    
    inline def apply(): PickSpawnOptionscwd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickSpawnOptionscwd]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickSpawnOptionscwd] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShouldUpdateRepo] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Spinner] (val x: Self) extends AnyVal {
      
      inline def setSpinner(value: Ora): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      inline def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
    }
  }
}
