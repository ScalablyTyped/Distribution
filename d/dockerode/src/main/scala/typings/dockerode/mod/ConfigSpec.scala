package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigSpec extends StObject {
  
  var Data: String
  
  var Labels: StringDictionary[String]
  
  var Name: String
}
object ConfigSpec {
  
  @scala.inline
  def apply(Data: String, Labels: StringDictionary[String], Name: String): ConfigSpec = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigSpec]
  }
  
  @scala.inline
  implicit class ConfigSpecMutableBuilder[Self <: ConfigSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
