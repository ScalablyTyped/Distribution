package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A social media or web channel for a candidate.
  */
trait SchemaChannel extends StObject {
  
  /**
    * The unique public identifier for the candidate&#39;s channel.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The type of channel. The following is a list of types of channels, but is
    * not exhaustive. More channel types may be added at a later time. One of:
    * GooglePlus, YouTube, Facebook, Twitter
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaChannel {
  
  @scala.inline
  def apply(): SchemaChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannel]
  }
  
  @scala.inline
  implicit class SchemaChannelMutableBuilder[Self <: SchemaChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
