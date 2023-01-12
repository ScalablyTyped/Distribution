package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blocksize extends StObject {
  
  /**
    * Blocksize for pixelate
    * @default 4
    */
  var blocksize: js.UndefOr[Double] = js.undefined
}
object Blocksize {
  
  inline def apply(): Blocksize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blocksize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Blocksize] (val x: Self) extends AnyVal {
    
    inline def setBlocksize(value: Double): Self = StObject.set(x, "blocksize", value.asInstanceOf[js.Any])
    
    inline def setBlocksizeUndefined: Self = StObject.set(x, "blocksize", js.undefined)
  }
}
