package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesShrink[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var copy_settings: js.UndefOr[Boolean] = js.native
  
  var index: String = js.native
  
  var master_timeout: js.UndefOr[String] = js.native
  
  var target: String = js.native
  
  var timeout: js.UndefOr[String] = js.native
  
  var wait_for_active_shards: js.UndefOr[String] = js.native
}
object IndicesShrink {
  
  @scala.inline
  def apply[T](index: String, target: String): IndicesShrink[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesShrink[T]]
  }
  
  @scala.inline
  implicit class IndicesShrinkMutableBuilder[Self <: IndicesShrink[_], T] (val x: Self with IndicesShrink[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCopy_settings(value: Boolean): Self = StObject.set(x, "copy_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy_settingsUndefined: Self = StObject.set(x, "copy_settings", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
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
