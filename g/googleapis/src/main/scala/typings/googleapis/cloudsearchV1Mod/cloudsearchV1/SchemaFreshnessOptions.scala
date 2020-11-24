package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait SchemaFreshnessOptions extends js.Object {
  
  /**
    * The duration after which an object should be considered stale. The
    * default value is 180 days (in seconds).
    */
  var freshnessDuration: js.UndefOr[String] = js.native
  
  /**
    * This property indicates the freshness level of the object in the index.
    * If set, this property must be a top-level property within the property
    * definitions and it must be a timestamp type or date type. Otherwise, the
    * Indexing API uses updateTime as the freshness indicator. The maximum
    * length is 256 characters.  When a property is used to calculate
    * fresheness, the value defaults to 2 years from the current time.
    */
  var freshnessProperty: js.UndefOr[String] = js.native
}
object SchemaFreshnessOptions {
  
  @scala.inline
  def apply(): SchemaFreshnessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreshnessOptions]
  }
  
  @scala.inline
  implicit class SchemaFreshnessOptionsOps[Self <: SchemaFreshnessOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFreshnessDuration(value: String): Self = this.set("freshnessDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreshnessDuration: Self = this.set("freshnessDuration", js.undefined)
    
    @scala.inline
    def setFreshnessProperty(value: String): Self = this.set("freshnessProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreshnessProperty: Self = this.set("freshnessProperty", js.undefined)
  }
}
