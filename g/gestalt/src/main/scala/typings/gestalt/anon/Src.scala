package typings.gestalt.anon

import typings.gestalt.gestaltStrings.videoSlashm3u8
import typings.gestalt.gestaltStrings.videoSlashmp4
import typings.gestalt.gestaltStrings.videoSlashogg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Src extends StObject {
  
  var src: String = js.native
  
  var `type`: videoSlashm3u8 | videoSlashmp4 | videoSlashogg = js.native
}
object Src {
  
  @scala.inline
  def apply(src: String, `type`: videoSlashm3u8 | videoSlashmp4 | videoSlashogg): Src = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Src]
  }
  
  @scala.inline
  implicit class SrcMutableBuilder[Self <: Src] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: videoSlashm3u8 | videoSlashmp4 | videoSlashogg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
