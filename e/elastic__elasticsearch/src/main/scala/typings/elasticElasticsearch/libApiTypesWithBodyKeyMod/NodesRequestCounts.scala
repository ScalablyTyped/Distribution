package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesRequestCounts extends StObject {
  
  var GetBlob: js.UndefOr[long] = js.undefined
  
  var GetBlobProperties: js.UndefOr[long] = js.undefined
  
  var GetObject: js.UndefOr[long] = js.undefined
  
  var InsertObject: js.UndefOr[long] = js.undefined
  
  var ListBlobs: js.UndefOr[long] = js.undefined
  
  var ListObjects: js.UndefOr[long] = js.undefined
  
  var PutBlob: js.UndefOr[long] = js.undefined
  
  var PutBlock: js.UndefOr[long] = js.undefined
  
  var PutBlockList: js.UndefOr[long] = js.undefined
  
  var PutMultipartObject: js.UndefOr[long] = js.undefined
  
  var PutObject: js.UndefOr[long] = js.undefined
}
object NodesRequestCounts {
  
  inline def apply(): NodesRequestCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesRequestCounts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesRequestCounts] (val x: Self) extends AnyVal {
    
    inline def setGetBlob(value: long): Self = StObject.set(x, "GetBlob", value.asInstanceOf[js.Any])
    
    inline def setGetBlobProperties(value: long): Self = StObject.set(x, "GetBlobProperties", value.asInstanceOf[js.Any])
    
    inline def setGetBlobPropertiesUndefined: Self = StObject.set(x, "GetBlobProperties", js.undefined)
    
    inline def setGetBlobUndefined: Self = StObject.set(x, "GetBlob", js.undefined)
    
    inline def setGetObject(value: long): Self = StObject.set(x, "GetObject", value.asInstanceOf[js.Any])
    
    inline def setGetObjectUndefined: Self = StObject.set(x, "GetObject", js.undefined)
    
    inline def setInsertObject(value: long): Self = StObject.set(x, "InsertObject", value.asInstanceOf[js.Any])
    
    inline def setInsertObjectUndefined: Self = StObject.set(x, "InsertObject", js.undefined)
    
    inline def setListBlobs(value: long): Self = StObject.set(x, "ListBlobs", value.asInstanceOf[js.Any])
    
    inline def setListBlobsUndefined: Self = StObject.set(x, "ListBlobs", js.undefined)
    
    inline def setListObjects(value: long): Self = StObject.set(x, "ListObjects", value.asInstanceOf[js.Any])
    
    inline def setListObjectsUndefined: Self = StObject.set(x, "ListObjects", js.undefined)
    
    inline def setPutBlob(value: long): Self = StObject.set(x, "PutBlob", value.asInstanceOf[js.Any])
    
    inline def setPutBlobUndefined: Self = StObject.set(x, "PutBlob", js.undefined)
    
    inline def setPutBlock(value: long): Self = StObject.set(x, "PutBlock", value.asInstanceOf[js.Any])
    
    inline def setPutBlockList(value: long): Self = StObject.set(x, "PutBlockList", value.asInstanceOf[js.Any])
    
    inline def setPutBlockListUndefined: Self = StObject.set(x, "PutBlockList", js.undefined)
    
    inline def setPutBlockUndefined: Self = StObject.set(x, "PutBlock", js.undefined)
    
    inline def setPutMultipartObject(value: long): Self = StObject.set(x, "PutMultipartObject", value.asInstanceOf[js.Any])
    
    inline def setPutMultipartObjectUndefined: Self = StObject.set(x, "PutMultipartObject", js.undefined)
    
    inline def setPutObject(value: long): Self = StObject.set(x, "PutObject", value.asInstanceOf[js.Any])
    
    inline def setPutObjectUndefined: Self = StObject.set(x, "PutObject", js.undefined)
  }
}
