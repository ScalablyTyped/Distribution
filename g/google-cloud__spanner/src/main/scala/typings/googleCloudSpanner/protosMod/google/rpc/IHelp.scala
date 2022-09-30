package typings.googleCloudSpanner.protosMod.google.rpc

import typings.googleCloudSpanner.protosMod.google.rpc.Help.ILink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Help. */
trait IHelp extends StObject {
  
  /** Help links */
  var links: js.UndefOr[js.Array[ILink] | Null] = js.undefined
}
object IHelp {
  
  inline def apply(): IHelp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHelp]
  }
  
  extension [Self <: IHelp](x: Self) {
    
    inline def setLinks(value: js.Array[ILink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksNull: Self = StObject.set(x, "links", null)
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: ILink*): Self = StObject.set(x, "links", js.Array(value*))
  }
}
