package typings.fastify.anon

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseAs[parseAs /* <: String | Buffer */] extends StObject {
  
  var bodyLimit: js.UndefOr[Double] = js.undefined
  
  var parseAs: /* import warning: importer.ImportType#apply Failed type conversion: parseAs extends node.buffer.<global>.Buffer ? 'buffer' : 'string' */ js.Any
}
object ParseAs {
  
  inline def apply[parseAs /* <: String | Buffer */](
    parseAs: /* import warning: importer.ImportType#apply Failed type conversion: parseAs extends node.buffer.<global>.Buffer ? 'buffer' : 'string' */ js.Any
  ): ParseAs[parseAs] = {
    val __obj = js.Dynamic.literal(parseAs = parseAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseAs[parseAs]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParseAs[?], parseAs /* <: String | Buffer */] (val x: Self & ParseAs[parseAs]) extends AnyVal {
    
    inline def setBodyLimit(value: Double): Self = StObject.set(x, "bodyLimit", value.asInstanceOf[js.Any])
    
    inline def setBodyLimitUndefined: Self = StObject.set(x, "bodyLimit", js.undefined)
    
    inline def setParseAs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: parseAs extends node.buffer.<global>.Buffer ? 'buffer' : 'string' */ js.Any
    ): Self = StObject.set(x, "parseAs", value.asInstanceOf[js.Any])
  }
}
