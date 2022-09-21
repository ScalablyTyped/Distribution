package typings.elliptic.mod

import typings.elliptic.mod.^
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def rand: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("rand").asInstanceOf[Any]

inline def utils: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("utils").asInstanceOf[Any]

inline def version: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[Double]

type BNInput = String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any) | Double | Buffer | js.typedarray.Uint8Array | js.Array[Double]

/* Rewritten from type alias, can be one of: 
  - typings.elliptic.mod.ec.Signature
  - typings.elliptic.mod.ec.SignatureOptions
  - js.typedarray.Uint8Array
  - js.Array[scala.Double]
  - java.lang.String
*/
type SignatureInput = _SignatureInput | js.Array[Double] | js.typedarray.Uint8Array | String
