package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the table style settings.
  */
@JSGlobal("TableStyle")
@js.native
open class TableStyle ()
  extends StObject
     with typings.devexpressWeb.TableStyle {
  
  /**
    * Gets whether the specified style is marked as deleted.
    */
  /* CompleteClass */
  override val isDeleted: Boolean = js.native
  
  /**
    * Gets or sets the name of the style.
    */
  /* CompleteClass */
  override val name: String = js.native
  
  /**
    * Gets or sets the style from which the current style inherits.
    */
  /* CompleteClass */
  override val parent: typings.devexpressWeb.TableStyle = js.native
}
