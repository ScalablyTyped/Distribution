package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of Bigtable Tables and the resources that serve them. All
  * tables in an instance are served from all Clusters in the instance.
  */
@js.native
trait SchemaInstance extends js.Object {
  
  /**
    * The descriptive name for this instance as it appears in UIs. Can be
    * changed at any time, but should be kept globally unique to avoid
    * confusion.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Labels are a flexible and lightweight mechanism for organizing cloud
    * resources into groups that reflect a customer&#39;s organizational needs
    * and deployment strategies. They can be used to filter resources and
    * aggregate metrics.  * Label keys must be between 1 and 63 characters long
    * and must conform to   the regular expression: `\p{Ll}\p{Lo}{0,62}`. *
    * Label values must be between 0 and 63 characters long and must conform to
    * the regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`. * No more than 64
    * labels can be associated with a given resource. * Keys and values must
    * both be under 128 bytes.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * (`OutputOnly`) The unique name of the instance. Values are of the form
    * `projects/&lt;project&gt;/instances/a-z+[a-z0-9]`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * (`OutputOnly`) The current state of the instance.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * The type of the instance. Defaults to `PRODUCTION`.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaInstance {
  
  @scala.inline
  def apply(): SchemaInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstance]
  }
  
  @scala.inline
  implicit class SchemaInstanceOps[Self <: SchemaInstance] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
