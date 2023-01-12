package typings.expoModulesCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CurrentVersion extends StObject {
    
    var currentVersion: js.UndefOr[String] = js.undefined
    
    var replacement: js.UndefOr[String] = js.undefined
    
    var versionToRemove: js.UndefOr[String] = js.undefined
  }
  object CurrentVersion {
    
    inline def apply(): CurrentVersion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CurrentVersion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CurrentVersion] (val x: Self) extends AnyVal {
      
      inline def setCurrentVersion(value: String): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
      
      inline def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
      
      inline def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
      
      inline def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
      
      inline def setVersionToRemove(value: String): Self = StObject.set(x, "versionToRemove", value.asInstanceOf[js.Any])
      
      inline def setVersionToRemoveUndefined: Self = StObject.set(x, "versionToRemove", js.undefined)
    }
  }
}
