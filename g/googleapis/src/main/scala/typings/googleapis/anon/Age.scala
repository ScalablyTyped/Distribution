package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Age extends StObject {
  
  var age: js.UndefOr[Double] = js.undefined
  
  var createdBefore: js.UndefOr[String] = js.undefined
  
  var customTimeBefore: js.UndefOr[String] = js.undefined
  
  var daysSinceCustomTime: js.UndefOr[Double] = js.undefined
  
  var daysSinceNoncurrentTime: js.UndefOr[Double] = js.undefined
  
  var isLive: js.UndefOr[Boolean] = js.undefined
  
  var matchesPattern: js.UndefOr[String] = js.undefined
  
  var matchesPrefix: js.UndefOr[js.Array[String]] = js.undefined
  
  var matchesStorageClass: js.UndefOr[js.Array[String]] = js.undefined
  
  var matchesSuffix: js.UndefOr[js.Array[String]] = js.undefined
  
  var noncurrentTimeBefore: js.UndefOr[String] = js.undefined
  
  var numNewerVersions: js.UndefOr[Double] = js.undefined
}
object Age {
  
  inline def apply(): Age = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Age]
  }
  
  extension [Self <: Age](x: Self) {
    
    inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    inline def setCreatedBefore(value: String): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
    
    inline def setCustomTimeBefore(value: String): Self = StObject.set(x, "customTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCustomTimeBeforeUndefined: Self = StObject.set(x, "customTimeBefore", js.undefined)
    
    inline def setDaysSinceCustomTime(value: Double): Self = StObject.set(x, "daysSinceCustomTime", value.asInstanceOf[js.Any])
    
    inline def setDaysSinceCustomTimeUndefined: Self = StObject.set(x, "daysSinceCustomTime", js.undefined)
    
    inline def setDaysSinceNoncurrentTime(value: Double): Self = StObject.set(x, "daysSinceNoncurrentTime", value.asInstanceOf[js.Any])
    
    inline def setDaysSinceNoncurrentTimeUndefined: Self = StObject.set(x, "daysSinceNoncurrentTime", js.undefined)
    
    inline def setIsLive(value: Boolean): Self = StObject.set(x, "isLive", value.asInstanceOf[js.Any])
    
    inline def setIsLiveUndefined: Self = StObject.set(x, "isLive", js.undefined)
    
    inline def setMatchesPattern(value: String): Self = StObject.set(x, "matchesPattern", value.asInstanceOf[js.Any])
    
    inline def setMatchesPatternUndefined: Self = StObject.set(x, "matchesPattern", js.undefined)
    
    inline def setMatchesPrefix(value: js.Array[String]): Self = StObject.set(x, "matchesPrefix", value.asInstanceOf[js.Any])
    
    inline def setMatchesPrefixUndefined: Self = StObject.set(x, "matchesPrefix", js.undefined)
    
    inline def setMatchesPrefixVarargs(value: String*): Self = StObject.set(x, "matchesPrefix", js.Array(value*))
    
    inline def setMatchesStorageClass(value: js.Array[String]): Self = StObject.set(x, "matchesStorageClass", value.asInstanceOf[js.Any])
    
    inline def setMatchesStorageClassUndefined: Self = StObject.set(x, "matchesStorageClass", js.undefined)
    
    inline def setMatchesStorageClassVarargs(value: String*): Self = StObject.set(x, "matchesStorageClass", js.Array(value*))
    
    inline def setMatchesSuffix(value: js.Array[String]): Self = StObject.set(x, "matchesSuffix", value.asInstanceOf[js.Any])
    
    inline def setMatchesSuffixUndefined: Self = StObject.set(x, "matchesSuffix", js.undefined)
    
    inline def setMatchesSuffixVarargs(value: String*): Self = StObject.set(x, "matchesSuffix", js.Array(value*))
    
    inline def setNoncurrentTimeBefore(value: String): Self = StObject.set(x, "noncurrentTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setNoncurrentTimeBeforeUndefined: Self = StObject.set(x, "noncurrentTimeBefore", js.undefined)
    
    inline def setNumNewerVersions(value: Double): Self = StObject.set(x, "numNewerVersions", value.asInstanceOf[js.Any])
    
    inline def setNumNewerVersionsUndefined: Self = StObject.set(x, "numNewerVersions", js.undefined)
  }
}
