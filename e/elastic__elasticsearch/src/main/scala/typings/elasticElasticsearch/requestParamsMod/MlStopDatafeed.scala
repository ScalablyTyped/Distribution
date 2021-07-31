package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlStopDatafeed[T]
  extends StObject
     with Generic {
  
  var allow_no_datafeeds: js.UndefOr[Boolean] = js.undefined
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var body: js.UndefOr[T] = js.undefined
  
  var datafeed_id: String
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
}
object MlStopDatafeed {
  
  @scala.inline
  def apply[T](datafeed_id: String): MlStopDatafeed[T] = {
    val __obj = js.Dynamic.literal(datafeed_id = datafeed_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlStopDatafeed[T]]
  }
  
  @scala.inline
  implicit class MlStopDatafeedMutableBuilder[Self <: MlStopDatafeed[?], T] (val x: Self & MlStopDatafeed[T]) extends AnyVal {
    
    @scala.inline
    def setAllow_no_datafeeds(value: Boolean): Self = StObject.set(x, "allow_no_datafeeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_datafeedsUndefined: Self = StObject.set(x, "allow_no_datafeeds", js.undefined)
    
    @scala.inline
    def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setDatafeed_id(value: String): Self = StObject.set(x, "datafeed_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
