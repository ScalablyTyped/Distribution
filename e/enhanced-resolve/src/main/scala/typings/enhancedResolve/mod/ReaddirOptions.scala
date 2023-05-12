package typings.enhancedResolve.mod

import typings.enhancedResolve.enhancedResolveStrings.`ucs-2`
import typings.enhancedResolve.enhancedResolveStrings.`utf-8`
import typings.enhancedResolve.enhancedResolveStrings.ascii
import typings.enhancedResolve.enhancedResolveStrings.base64
import typings.enhancedResolve.enhancedResolveStrings.binary
import typings.enhancedResolve.enhancedResolveStrings.buffer
import typings.enhancedResolve.enhancedResolveStrings.hex
import typings.enhancedResolve.enhancedResolveStrings.latin1
import typings.enhancedResolve.enhancedResolveStrings.ucs2
import typings.enhancedResolve.enhancedResolveStrings.utf16le
import typings.enhancedResolve.enhancedResolveStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaddirOptions extends StObject {
  
  var encoding: js.UndefOr[
    Null | ascii | utf8 | `utf-8` | utf16le | ucs2 | `ucs-2` | base64 | latin1 | binary | hex | buffer
  ] = js.undefined
  
  var withFileTypes: js.UndefOr[Boolean] = js.undefined
}
object ReaddirOptions {
  
  inline def apply(): ReaddirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReaddirOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReaddirOptions] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: ascii | utf8 | `utf-8` | utf16le | ucs2 | `ucs-2` | base64 | latin1 | binary | hex | buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setWithFileTypes(value: Boolean): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    
    inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
  }
}
