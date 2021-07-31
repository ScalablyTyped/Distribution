package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Opaque filter criteria used by loadbalancers to restrict routing
  * configuration to a limited set of loadbalancing proxies. Proxies and
  * sidecars involved in loadbalancing would typically present metadata to the
  * loadbalancers which need to match criteria specified here. If a match takes
  * place, the relevant routing configuration is made available to those
  * proxies. For each metadataFilter in this list, if its filterMatchCriteria
  * is set to MATCH_ANY, at least one of the filterLabels must match the
  * corresponding label provided in the metadata. If its filterMatchCriteria is
  * set to MATCH_ALL, then all of its filterLabels must match with
  * corresponding labels in the provided metadata. An example for using
  * metadataFilters would be: if loadbalancing involves  Envoys, they will only
  * receive routing configuration when values in metadataFilters match values
  * supplied in &lt;a
  * href=&quot;https://www.envoyproxy.io/docs/envoy/latest/api-v2/api/v2/core/base.proto#envoy-api-msg-core-node&quot;
  * Node metadata of their XDS requests to loadbalancers.
  */
trait SchemaMetadataFilter extends StObject {
  
  /**
    * The list of label value pairs that must match labels in the provided
    * metadata based on filterMatchCriteria  This list must not be empty and
    * can have at the most 64 entries.
    */
  var filterLabels: js.UndefOr[js.Array[SchemaMetadataFilterLabelMatch]] = js.undefined
  
  /**
    * Specifies how individual filterLabel matches within the list of
    * filterLabels contribute towards the overall metadataFilter match.
    * Supported values are:   - MATCH_ANY: At least one of the filterLabels
    * must have a matching label in the provided metadata.  - MATCH_ALL: All
    * filterLabels must have matching labels in the provided metadata.
    */
  var filterMatchCriteria: js.UndefOr[String] = js.undefined
}
object SchemaMetadataFilter {
  
  @scala.inline
  def apply(): SchemaMetadataFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadataFilter]
  }
  
  @scala.inline
  implicit class SchemaMetadataFilterMutableBuilder[Self <: SchemaMetadataFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterLabels(value: js.Array[SchemaMetadataFilterLabelMatch]): Self = StObject.set(x, "filterLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterLabelsUndefined: Self = StObject.set(x, "filterLabels", js.undefined)
    
    @scala.inline
    def setFilterLabelsVarargs(value: SchemaMetadataFilterLabelMatch*): Self = StObject.set(x, "filterLabels", js.Array(value :_*))
    
    @scala.inline
    def setFilterMatchCriteria(value: String): Self = StObject.set(x, "filterMatchCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterMatchCriteriaUndefined: Self = StObject.set(x, "filterMatchCriteria", js.undefined)
  }
}
