package typings.emberCompatibilityHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ember-compatibility-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ember-compatibility-helpers", "HAS_DESCRIPTOR_TRAP")
  @js.native
  val HAS_DESCRIPTOR_TRAP: Boolean = js.native
  
  @JSImport("ember-compatibility-helpers", "HAS_MODERN_FACTORY_INJECTIONS")
  @js.native
  val HAS_MODERN_FACTORY_INJECTIONS: Boolean = js.native
  
  @JSImport("ember-compatibility-helpers", "HAS_NATIVE_COMPUTED_GETTERS")
  @js.native
  val HAS_NATIVE_COMPUTED_GETTERS: Boolean = js.native
  
  @JSImport("ember-compatibility-helpers", "HAS_UNDERSCORE_ACTIONS")
  @js.native
  val HAS_UNDERSCORE_ACTIONS: Boolean = js.native
  
  @JSImport("ember-compatibility-helpers", "IS_GLIMMER_2")
  @js.native
  val IS_GLIMMER_2: Boolean = js.native
  
  @JSImport("ember-compatibility-helpers", "IS_RECORD_DATA")
  @js.native
  val IS_RECORD_DATA: Boolean = js.native
  
  @JSImport("ember-compatibility-helpers", "SUPPORTS_CLOSURE_ACTIONS")
  @js.native
  val SUPPORTS_CLOSURE_ACTIONS: Boolean = js.native
  
  @JSImport("ember-compatibility-helpers", "SUPPORTS_FACTORY_FOR")
  @js.native
  val SUPPORTS_FACTORY_FOR: Boolean = js.native
  
  @JSImport("ember-compatibility-helpers", "SUPPORTS_GET_OWNER")
  @js.native
  val SUPPORTS_GET_OWNER: Boolean = js.native
  
  @JSImport("ember-compatibility-helpers", "SUPPORTS_INVERSE_BLOCK")
  @js.native
  val SUPPORTS_INVERSE_BLOCK: Boolean = js.native
  
  @JSImport("ember-compatibility-helpers", "SUPPORTS_NEW_COMPUTED")
  @js.native
  val SUPPORTS_NEW_COMPUTED: Boolean = js.native
  
  @JSImport("ember-compatibility-helpers", "SUPPORTS_SET_OWNER")
  @js.native
  val SUPPORTS_SET_OWNER: Boolean = js.native
  
  @JSImport("ember-compatibility-helpers", "SUPPORTS_UNIQ_BY_COMPUTED")
  @js.native
  val SUPPORTS_UNIQ_BY_COMPUTED: Boolean = js.native
  
  inline def gte(library: String, version: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(library.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gte(version: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("gte")(version.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def lte(library: String, version: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(library.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lte(version: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("lte")(version.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
