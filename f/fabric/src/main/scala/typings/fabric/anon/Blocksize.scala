package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blocksize extends StObject {
  
  /**
    * Blocksize for pixelate
    * @default 4
    */
  var blocksize: js.UndefOr[Double] = js.native
}
object Blocksize {
  
  @scala.inline
  def apply(): Blocksize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blocksize]
  }
  
  @scala.inline
  implicit class BlocksizeMutableBuilder[Self <: Blocksize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocksize(value: Double): Self = StObject.set(x, "blocksize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksizeUndefined: Self = StObject.set(x, "blocksize", js.undefined)
  }
}
