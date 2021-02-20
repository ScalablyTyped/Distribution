package typings.fsExtra.anon

import typings.fsExtra.fsExtraBooleans.`false`
import typings.fsExtra.fsExtraStrings.buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncodingWithFileTypes extends StObject {
  
  var encoding: buffer = js.native
  
  var withFileTypes: js.UndefOr[`false`] = js.native
}
object EncodingWithFileTypes {
  
  @scala.inline
  def apply(encoding: buffer): EncodingWithFileTypes = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingWithFileTypes]
  }
  
  @scala.inline
  implicit class EncodingWithFileTypesMutableBuilder[Self <: EncodingWithFileTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
  }
}
