package typings.dockerode.anon

import typings.dockerode.dockerodeStrings.global
import typings.dockerode.dockerodeStrings.replicated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: js.UndefOr[js.Array[String]] = js.undefined
  
  var label: js.UndefOr[js.Array[String]] = js.undefined
  
  var mode: js.UndefOr[js.Array[replicated | global]] = js.undefined
  
  var name: js.UndefOr[js.Array[String]] = js.undefined
}
object Id {
  
  inline def apply(): Id = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    inline def setId(value: js.Array[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdVarargs(value: String*): Self = StObject.set(x, "id", js.Array(value*))
    
    inline def setLabel(value: js.Array[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelVarargs(value: String*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setMode(value: js.Array[replicated | global]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setModeVarargs(value: (replicated | global)*): Self = StObject.set(x, "mode", js.Array(value*))
    
    inline def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
  }
}
