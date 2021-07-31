package typings.firebaseApp

import typings.firebaseAppTypes.mod.VersionService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseComponentMod {
  
  trait NameServiceMapping extends StObject {
    
    var `test-shell`: js.Promise[Unit]
    
    var vs1: VersionService
    
    var vs2: VersionService
  }
  object NameServiceMapping {
    
    @scala.inline
    def apply(`test-shell`: js.Promise[Unit], vs1: VersionService, vs2: VersionService): NameServiceMapping = {
      val __obj = js.Dynamic.literal(vs1 = vs1.asInstanceOf[js.Any], vs2 = vs2.asInstanceOf[js.Any])
      __obj.updateDynamic("test-shell")(`test-shell`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameServiceMapping]
    }
    
    @scala.inline
    implicit class NameServiceMappingMutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setTest-shell`(value: js.Promise[Unit]): Self = StObject.set(x, "test-shell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVs1(value: VersionService): Self = StObject.set(x, "vs1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVs2(value: VersionService): Self = StObject.set(x, "vs2", value.asInstanceOf[js.Any])
    }
  }
}
