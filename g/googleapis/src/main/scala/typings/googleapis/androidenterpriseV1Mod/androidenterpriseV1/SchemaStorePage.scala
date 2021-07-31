package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of a managed Google Play store page, made of a localized name
  * and links to other pages. A page also contains clusters defined as a
  * subcollection.
  */
trait SchemaStorePage extends StObject {
  
  /**
    * Unique ID of this page. Assigned by the server. Immutable once assigned.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#storePage&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Ordered list of pages a user should be able to reach from this page. The
    * list can&#39;t include this page. It is recommended that the basic pages
    * are created first, before adding the links between pages.  The API
    * doesn&#39;t verify that the pages exist or the pages are reachable.
    */
  var link: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Ordered list of localized strings giving the name of this page. The text
    * displayed is the one that best matches the user locale, or the first
    * entry if there is no good match. There needs to be at least one entry.
    */
  var name: js.UndefOr[js.Array[SchemaLocalizedText]] = js.undefined
}
object SchemaStorePage {
  
  @scala.inline
  def apply(): SchemaStorePage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStorePage]
  }
  
  @scala.inline
  implicit class SchemaStorePageMutableBuilder[Self <: SchemaStorePage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLink(value: js.Array[String]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: String*): Self = StObject.set(x, "link", js.Array(value :_*))
    
    @scala.inline
    def setName(value: js.Array[SchemaLocalizedText]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: SchemaLocalizedText*): Self = StObject.set(x, "name", js.Array(value :_*))
  }
}
