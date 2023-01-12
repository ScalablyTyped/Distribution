package typings.drawflow

import org.scalablytyped.runtime.StringDictionary
import typings.drawflow.mod.DrawflowModuleData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DictcustomModuleName
    extends StObject
       with // always present
  /* customModuleName */ StringDictionary[DrawflowModuleData] {
    
    var Home: DrawflowModuleData
  }
  object DictcustomModuleName {
    
    inline def apply(Home: DrawflowModuleData): DictcustomModuleName = {
      val __obj = js.Dynamic.literal(Home = Home.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictcustomModuleName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DictcustomModuleName] (val x: Self) extends AnyVal {
      
      inline def setHome(value: DrawflowModuleData): Self = StObject.set(x, "Home", value.asInstanceOf[js.Any])
    }
  }
}
