package typings.esAggregateError

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("es-aggregate-error", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends typings.esAggregateError.implementationMod.^
  @JSImport("es-aggregate-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("es-aggregate-error", "getPolyfill")
  @js.native
  def getPolyfill: js.Function0[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
  ] = js.native
  inline def getPolyfill_=(
    x: js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPolyfill")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("es-aggregate-error", "implementation")
  @js.native
  open class implementation protected ()
    extends typings.esAggregateError.implementationMod.^ {
    // Using `any` here, to match Node's own typings:
    def this(errors: js.Array[Any]) = this()
    def this(errors: js.Array[Any], message: String) = this()
  }
  /* static member */
  @JSImport("es-aggregate-error", "implementation")
  @js.native
  def implementation: Instantiable2[
    /* errors */ js.Array[Any], 
    /* message */ js.UndefOr[String], 
    typings.esAggregateError.implementationMod.^
  ] = js.native
  inline def implementation_=(
    x: Instantiable2[
      /* errors */ js.Array[Any], 
      /* message */ js.UndefOr[String], 
      typings.esAggregateError.implementationMod.^
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementation")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("es-aggregate-error", "shim")
  @js.native
  def shim: js.Function0[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
  ] = js.native
  inline def shim_=(
    x: js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shim")(x.asInstanceOf[js.Any])
  
  type AggregateError = typings.esAggregateError.implementationMod.^
}
