package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complex {
  
  @JSImport("framer-motion", "complex")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("framer-motion", "complex.createTransformer")
  @js.native
  def createTransformer: js.Function1[
    /* source */ String | Double, 
    js.Function1[/* v */ js.Array[CSSVariableToken | Color_ | Double | String], String]
  ] = js.native
  inline def createTransformer_=(
    x: js.Function1[
      /* source */ String | Double, 
      js.Function1[/* v */ js.Array[CSSVariableToken | Color_ | Double | String], String]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createTransformer")(x.asInstanceOf[js.Any])
  
  @JSImport("framer-motion", "complex.getAnimatableNone")
  @js.native
  def getAnimatableNone: js.Function1[/* v */ String | Double, String] = js.native
  inline def getAnimatableNone_=(x: js.Function1[/* v */ String | Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAnimatableNone")(x.asInstanceOf[js.Any])
  
  @JSImport("framer-motion", "complex.parse")
  @js.native
  def parse: js.Function1[
    /* v */ String | Double, 
    js.Array[Double | (/* template literal string: var(--${string}) */ String) | Color_]
  ] = js.native
  inline def parse_=(
    x: js.Function1[
      /* v */ String | Double, 
      js.Array[Double | (/* template literal string: var(--${string}) */ String) | Color_]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
  
  @JSImport("framer-motion", "complex.test")
  @js.native
  def test: js.Function1[/* v */ Any, Boolean] = js.native
  inline def test_=(x: js.Function1[/* v */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("test")(x.asInstanceOf[js.Any])
}
