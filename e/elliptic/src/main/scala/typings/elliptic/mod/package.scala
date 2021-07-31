package typings.elliptic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def rand: js.Any = typings.elliptic.mod.^.asInstanceOf[js.Dynamic].selectDynamic("rand").asInstanceOf[js.Any]

@scala.inline
def utils: js.Any = typings.elliptic.mod.^.asInstanceOf[js.Dynamic].selectDynamic("utils").asInstanceOf[js.Any]

@scala.inline
def version: scala.Double = typings.elliptic.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[scala.Double]

type BNInput = java.lang.String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | scala.Double | typings.node.Buffer | typings.std.Uint8Array | js.Array[scala.Double]

/* Rewritten from type alias, can be one of: 
  - typings.elliptic.mod.ec.Signature
  - typings.elliptic.mod.ec.SignatureOptions
  - typings.std.Uint8Array
  - js.Array[scala.Double]
  - java.lang.String
*/
type SignatureInput = typings.elliptic.mod._SignatureInput | js.Array[scala.Double] | typings.std.Uint8Array | java.lang.String
