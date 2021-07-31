package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Age extends StObject {
  
  var age: js.UndefOr[Double] = js.undefined
  
  var createdBefore: js.UndefOr[String] = js.undefined
  
  var isLive: js.UndefOr[Boolean] = js.undefined
  
  var matchesPattern: js.UndefOr[String] = js.undefined
  
  var matchesStorageClass: js.UndefOr[js.Array[String]] = js.undefined
  
  var numNewerVersions: js.UndefOr[Double] = js.undefined
}
object Age {
  
  @scala.inline
  def apply(): Age = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Age]
  }
  
  @scala.inline
  implicit class AgeMutableBuilder[Self <: Age] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    @scala.inline
    def setCreatedBefore(value: String): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
    
    @scala.inline
    def setIsLive(value: Boolean): Self = StObject.set(x, "isLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLiveUndefined: Self = StObject.set(x, "isLive", js.undefined)
    
    @scala.inline
    def setMatchesPattern(value: String): Self = StObject.set(x, "matchesPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesPatternUndefined: Self = StObject.set(x, "matchesPattern", js.undefined)
    
    @scala.inline
    def setMatchesStorageClass(value: js.Array[String]): Self = StObject.set(x, "matchesStorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesStorageClassUndefined: Self = StObject.set(x, "matchesStorageClass", js.undefined)
    
    @scala.inline
    def setMatchesStorageClassVarargs(value: String*): Self = StObject.set(x, "matchesStorageClass", js.Array(value :_*))
    
    @scala.inline
    def setNumNewerVersions(value: Double): Self = StObject.set(x, "numNewerVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumNewerVersionsUndefined: Self = StObject.set(x, "numNewerVersions", js.undefined)
  }
}
