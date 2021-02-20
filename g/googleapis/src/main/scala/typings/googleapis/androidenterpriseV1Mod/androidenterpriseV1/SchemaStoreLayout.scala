package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * General setting for the managed Google Play store layout, currently only
  * specifying the page to display the first time the store is opened.
  */
@js.native
trait SchemaStoreLayout extends StObject {
  
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
  implicit class SchemaStoreLayoutMutableBuilder[Self <: SchemaStoreLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHomepageId(value: String): Self = StObject.set(x, "homepageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomepageIdUndefined: Self = StObject.set(x, "homepageId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setStoreLayoutType(value: String): Self = StObject.set(x, "storeLayoutType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreLayoutTypeUndefined: Self = StObject.set(x, "storeLayoutType", js.undefined)
  }
}
