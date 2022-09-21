package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings of a tab stop.
  */
@JSGlobal("TabSettings")
@js.native
open class TabSettings ()
  extends StObject
     with typings.devexpressWeb.TabSettings {
  
  /**
    * Specifies the tab alignment type.
    */
  /* CompleteClass */
  var alignment: typings.devexpressWeb.TabAlign = js.native
  
  /**
    * Specifies whether the individual tab stop is in effect.
    */
  /* CompleteClass */
  var deleted: Boolean = js.native
  
  /**
    * Specifies the tab leader symbol.
    */
  /* CompleteClass */
  var leader: typings.devexpressWeb.TabLeaderType = js.native
  
  /**
    * Specifies the position of the tab stop.
    */
  /* CompleteClass */
  var position: Double = js.native
}
