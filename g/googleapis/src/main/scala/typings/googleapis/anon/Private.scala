package typings.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Private extends StObject {
  
  var `private`: js.UndefOr[StringDictionary[String]] = js.native
  
  var shared: js.UndefOr[StringDictionary[String]] = js.native
}
object Private {
  
  @scala.inline
  def apply(): Private = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Private]
  }
  
  @scala.inline
  implicit class PrivateMutableBuilder[Self <: Private] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivate(value: StringDictionary[String]): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    @scala.inline
    def setShared(value: StringDictionary[String]): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
  }
}
