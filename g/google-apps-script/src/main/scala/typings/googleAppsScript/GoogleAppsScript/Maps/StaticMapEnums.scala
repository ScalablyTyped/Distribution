package typings.googleAppsScript.GoogleAppsScript.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of enums used by StaticMap.
  */
@js.native
trait StaticMapEnums extends js.Object {
  
  var Color: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Color */ js.Any = js.native
  
  var Format: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Format */ js.Any = js.native
  
  var MarkerSize: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MarkerSize */ js.Any = js.native
  
  var Type: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type */ js.Any = js.native
}
object StaticMapEnums {
  
  @scala.inline
  def apply(
    Color: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Color */ js.Any,
    Format: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Format */ js.Any,
    MarkerSize: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MarkerSize */ js.Any,
    Type: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type */ js.Any
  ): StaticMapEnums = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], MarkerSize = MarkerSize.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticMapEnums]
  }
  
  @scala.inline
  implicit class StaticMapEnumsOps[Self <: StaticMapEnums] (val x: Self) extends AnyVal {
    
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
    def setColor(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Color */ js.Any): Self = this.set("Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Format */ js.Any): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerSize(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MarkerSize */ js.Any): Self = this.set("MarkerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type */ js.Any): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
