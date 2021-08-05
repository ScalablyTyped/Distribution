package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indicates which freshness property to use when adjusting search ranking for
  * an item. Fresher, more recent dates indicate higher quality. Use the
  * freshness option property that best works with your data. For fileshare
  * documents, last modified time is most relevant. For calendar event data,
  * the time when the event occurs is a more relevant freshness indicator. In
  * this way, calendar events that occur closer to the time of the search query
  * are considered higher quality and ranked accordingly.
  */
trait SchemaFreshnessOptions extends StObject {
  
  /**
    * The duration after which an object should be considered stale. The
    * default value is 180 days (in seconds).
    */
  var freshnessDuration: js.UndefOr[String] = js.undefined
  
  /**
    * This property indicates the freshness level of the object in the index.
    * If set, this property must be a top-level property within the property
    * definitions and it must be a timestamp type or date type. Otherwise, the
    * Indexing API uses updateTime as the freshness indicator. The maximum
    * length is 256 characters.  When a property is used to calculate
    * fresheness, the value defaults to 2 years from the current time.
    */
  var freshnessProperty: js.UndefOr[String] = js.undefined
}
object SchemaFreshnessOptions {
  
  inline def apply(): SchemaFreshnessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreshnessOptions]
  }
  
  extension [Self <: SchemaFreshnessOptions](x: Self) {
    
    inline def setFreshnessDuration(value: String): Self = StObject.set(x, "freshnessDuration", value.asInstanceOf[js.Any])
    
    inline def setFreshnessDurationUndefined: Self = StObject.set(x, "freshnessDuration", js.undefined)
    
    inline def setFreshnessProperty(value: String): Self = StObject.set(x, "freshnessProperty", value.asInstanceOf[js.Any])
    
    inline def setFreshnessPropertyUndefined: Self = StObject.set(x, "freshnessProperty", js.undefined)
  }
}
