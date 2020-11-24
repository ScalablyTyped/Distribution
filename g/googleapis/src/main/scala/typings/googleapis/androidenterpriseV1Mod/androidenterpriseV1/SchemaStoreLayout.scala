package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * General setting for the managed Google Play store layout, currently only
  * specifying the page to display the first time the store is opened.
  */
@js.native
trait SchemaStoreLayout extends js.Object {
  
  /**
    * The ID of the store page to be used as the homepage. The homepage is the
    * first page shown in the managed Google Play Store.  Not specifying a
    * homepage is equivalent to setting the store layout type to
    * &quot;basic&quot;.
    */
  var homepageId: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#storeLayout&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The store layout type. By default, this value is set to &quot;basic&quot;
    * if the homepageId field is not set, and to &quot;custom&quot; otherwise.
    * If set to &quot;basic&quot;, the layout will consist of all approved apps
    * that have been whitelisted for the user.
    */
  var storeLayoutType: js.UndefOr[String] = js.native
}
object SchemaStoreLayout {
  
  @scala.inline
  def apply(): SchemaStoreLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStoreLayout]
  }
  
  @scala.inline
  implicit class SchemaStoreLayoutOps[Self <: SchemaStoreLayout] (val x: Self) extends AnyVal {
    
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
    def setHomepageId(value: String): Self = this.set("homepageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomepageId: Self = this.set("homepageId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setStoreLayoutType(value: String): Self = this.set("storeLayoutType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreLayoutType: Self = this.set("storeLayoutType", js.undefined)
  }
}
