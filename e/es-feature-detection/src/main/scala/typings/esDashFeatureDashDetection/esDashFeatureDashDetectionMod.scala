package typings.esDashFeatureDashDetection

import typings.esDashFeatureDashDetection.esDashFeatureDashDetectionMod.ES2015Builtins
import typings.esDashFeatureDashDetection.esDashFeatureDashDetectionMod.ES2015Syntax
import typings.esDashFeatureDashDetection.esDashFeatureDashDetectionMod.ES2016Builtins
import typings.esDashFeatureDashDetection.esDashFeatureDashDetectionMod.ES2016Syntax
import typings.esDashFeatureDashDetection.esDashFeatureDashDetectionMod.ES2017Builtins
import typings.esDashFeatureDashDetection.esDashFeatureDashDetectionMod.ES2017Syntax
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es-feature-detection", JSImport.Namespace)
@js.native
object esDashFeatureDashDetectionMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.__all
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.ArrayDOTfrom
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.ArrayDOTof
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.ArrayDOTprototypeDOTfill
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.ArrayDOTprototypeDOTfind
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.ArrayDOTprototypeDOTfindIndex
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.ArrayDOTprototypeDOTentries
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.ArrayDOTprototypeDOTkeys
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.ArrayDOTprototypeDOTcopyWithin
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.base64
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.Map
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.Set
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.WeakMap
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.WeakSet
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.MathDOTimul
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.MathDOTclz32
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.MathDOTfround
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.MathDOTlog10
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.MathDOTlog2
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.MathDOTlog1p
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.MathDOTexpm1
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.MathDOTcosh
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.MathDOTsinh
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.MathDOTtanh
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.MathDOTacosh
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.MathDOTasinh
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.MathDOThypot
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.MathDOTtrunc
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.MathDOTsign
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.MathDOTcbrt
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.NumberDOTisNaN
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.NumberDOTisFinite
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.NumberDOTisInteger
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.NumberDOTparseInt
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.NumberDOTparseFloat
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.NumberDOTEPSILON
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.NumberDOTMAX_SAFE_INTEGER
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.NumberDOTMIN_SAFE_INTEGER
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.NumberDOTisSafeInteger
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.ObjectDOTprototypeDOT__proto__
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.ObjectDOTis
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.ObjectDOTsetPrototypeOf
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.ObjectDOTassign
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.ObjectDOTgetOwnPropertySymbols
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.Promise
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.Proxy
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.Reflect
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.requestAnimationFrame
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.StringDOTfromCodePoint
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.StringDOTprototypeDOTcodePointAt
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.StringDOTprototypeDOTstartsWith
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.StringDOTprototypeDOTendsWith
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.StringDOTprototypeDOTincludes
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.StringDOTprototypeDOTrepeat
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.StringDOTprototypeDOTnormalize
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.StringDOTraw
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.Symbol
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.TypedArrays
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.newDOTtarget
  */
  trait ES2015Builtins extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.__all
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.forDOTDOTDOTof
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.RegExpDOTprototypeDOTsticky
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.RegExpDOTprototypeDOTunicode
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.const
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.let
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.Destructuring
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.`Spread Array`
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.`Spread Function call`
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.`Rest parameters`
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.`Default parameters`
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.`Arrow function`
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.`Generator function`
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.`Binary literals`
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.`Octal literals`
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.`Template Strings`
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.`Shorthand property`
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.`Shorthand method`
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.`Computed property`
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.`Block level function declaration`
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.`class`
  */
  trait ES2015Syntax extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.__all
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.ArrayDOTprototypeDOTincludes
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.TypedArrayDOTprototypeDOTincludes
  */
  trait ES2016Builtins extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.__all
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.`Exponentiation operator`
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.`Rest destructuring`
  */
  trait ES2016Syntax extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.__all
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.Atomics
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.ObjectDOTvalues
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.ObjectDOTentries
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.ObjectDOTgetOwnPropertyDescriptors
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.StringDOTprototypeDOTpadEnd
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.StringDOTprototypeDOTpadStart
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.SharedArrayBuffer
  */
  trait ES2017Builtins extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.__all
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.`async/await`
    - typings.esDashFeatureDashDetection.esDashFeatureDashDetectionStrings.`Trailing parameter commas`
  */
  trait ES2017Syntax extends js.Object
  
  def builtins(): (Record[ES2015Builtins | ES2016Builtins | ES2017Builtins, Boolean]) with Anon_Es2015 = js.native
  def syntax(): (Record[ES2015Syntax | ES2016Syntax | ES2017Syntax, Boolean]) with Anon_Es2015Es2016 = js.native
}

