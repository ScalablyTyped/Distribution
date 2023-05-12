package typings.ethers.anon

import typings.ethers.ethersStrings.block
import typings.ethers.ethersStrings.close
import typings.ethers.ethersStrings.debug
import typings.ethers.ethersStrings.network
import typings.ethers.ethersStrings.pending
import typings.ethers.typesProvidersAbstractProviderMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag
  extends StObject
     with Subscription {
  
  var tag: String
  
  var `type`: block | close | debug | network | pending
}
object Tag {
  
  inline def apply(tag: String, `type`: block | close | debug | network | pending): Tag = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setType(value: block | close | debug | network | pending): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
