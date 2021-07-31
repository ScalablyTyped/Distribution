package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesRollover[T]
  extends StObject
     with Generic {
  
  var alias: String
  
  var body: js.UndefOr[T] = js.undefined
  
  var dry_run: js.UndefOr[Boolean] = js.undefined
  
  var include_type_name: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[String] = js.undefined
  
  var new_index: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
  
  var wait_for_active_shards: js.UndefOr[String] = js.undefined
}
object IndicesRollover {
  
  @scala.inline
  def apply[T](alias: String): IndicesRollover[T] = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRollover[T]]
  }
  
  @scala.inline
  implicit class IndicesRolloverMutableBuilder[Self <: IndicesRollover[?], T] (val x: Self & IndicesRollover[T]) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setDry_run(value: Boolean): Self = StObject.set(x, "dry_run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDry_runUndefined: Self = StObject.set(x, "dry_run", js.undefined)
    
    @scala.inline
    def setInclude_type_name(value: Boolean): Self = StObject.set(x, "include_type_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_type_nameUndefined: Self = StObject.set(x, "include_type_name", js.undefined)
    
    @scala.inline
    def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    @scala.inline
    def setNew_index(value: String): Self = StObject.set(x, "new_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_indexUndefined: Self = StObject.set(x, "new_index", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setWait_for_active_shards(value: String): Self = StObject.set(x, "wait_for_active_shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_active_shardsUndefined: Self = StObject.set(x, "wait_for_active_shards", js.undefined)
  }
}
