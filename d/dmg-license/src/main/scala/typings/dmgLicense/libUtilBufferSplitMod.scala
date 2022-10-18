package typings.dmgLicense

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilBufferSplitMod {
  
  @JSImport("dmg-license/lib/util/buffer-split", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bufferSplitMulti(buffer: Buffer, delimiters: js.Array[Delimiter]): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferSplitMulti")(buffer.asInstanceOf[js.Any], delimiters.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
  inline def bufferSplitMulti(buffer: Buffer, delimiters: js.Array[Delimiter], includeDelimiters: Boolean): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferSplitMulti")(buffer.asInstanceOf[js.Any], delimiters.asInstanceOf[js.Any], includeDelimiters.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
  
  inline def firstIndexOf[N /* <: js.typedarray.Uint8Array */](haystack: Buffer, needles: js.Array[N]): FirstIndex[N] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("firstIndexOf")(haystack.asInstanceOf[js.Any], needles.asInstanceOf[js.Any])).asInstanceOf[FirstIndex[N] | Null]
  inline def firstIndexOf[N /* <: js.typedarray.Uint8Array */](haystack: Buffer, needles: js.Array[N], byteOffset: Double): FirstIndex[N] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("firstIndexOf")(haystack.asInstanceOf[js.Any], needles.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[FirstIndex[N] | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typings.dmgLicense.dmgLicenseStrings.tab
    - typings.dmgLicense.dmgLicenseStrings.lf
    - typings.dmgLicense.dmgLicenseStrings.cr
    - typings.dmgLicense.dmgLicenseStrings.crlf
    - typings.dmgLicense.dmgLicenseStrings.nul
    - typings.dmgLicense.dmgLicenseStrings.eol
    - js.typedarray.Uint8Array
  */
  type Delimiter = _Delimiter | js.typedarray.Uint8Array
  
  trait FirstIndex[N] extends StObject {
    
    var index: Double
    
    var needle: N
    
    var needleIndex: Double
  }
  object FirstIndex {
    
    inline def apply[N](index: Double, needle: N, needleIndex: Double): FirstIndex[N] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], needle = needle.asInstanceOf[js.Any], needleIndex = needleIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirstIndex[N]]
    }
    
    extension [Self <: FirstIndex[?], N](x: Self & FirstIndex[N]) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setNeedle(value: N): Self = StObject.set(x, "needle", value.asInstanceOf[js.Any])
      
      inline def setNeedleIndex(value: Double): Self = StObject.set(x, "needleIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Delimiter extends StObject
}
