package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.all
import typings.elasticElasticsearch.elasticElasticsearchStrings.closed
import typings.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldCaps[T] extends Generic {
  
  var allow_no_indices: js.UndefOr[Boolean] = js.native
  
  var body: js.UndefOr[T] = js.native
  
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.native
  
  var fields: js.UndefOr[String | js.Array[String]] = js.native
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.native
  
  var include_unmapped: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[String | js.Array[String]] = js.native
}
object FieldCaps {
  
  @scala.inline
  def apply[T](): FieldCaps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldCaps[T]]
  }
  
  @scala.inline
  implicit class FieldCapsMutableBuilder[Self <: FieldCaps[_], T] (val x: Self with FieldCaps[T]) extends AnyVal {
    
    @scala.inline
    def setAllow_no_indices(value: Boolean): Self = StObject.set(x, "allow_no_indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_indicesUndefined: Self = StObject.set(x, "allow_no_indices", js.undefined)
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setExpand_wildcards(value: open | closed | hidden | none | all): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    @scala.inline
    def setFields(value: String | js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    @scala.inline
    def setInclude_unmapped(value: Boolean): Self = StObject.set(x, "include_unmapped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_unmappedUndefined: Self = StObject.set(x, "include_unmapped", js.undefined)
    
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
  }
}
