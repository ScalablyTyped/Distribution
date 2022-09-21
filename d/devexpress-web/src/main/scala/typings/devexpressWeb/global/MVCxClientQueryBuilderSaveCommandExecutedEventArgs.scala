package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the MVCxClientQueryBuilder.SaveCommandExecuted event.
  */
@JSGlobal("MVCxClientQueryBuilderSaveCommandExecutedEventArgs")
@js.native
open class MVCxClientQueryBuilderSaveCommandExecutedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.MVCxClientQueryBuilderSaveCommandExecutedEventArgs {
  /**
    * Initializes a new instance of the MVCxClientQueryBuilderSaveCommandExecutedEventArgs class with the specified settings.
    * @param result An object that specifies the Save command execution result.
    */
  def this(result: String) = this()
  
  /**
    * Specifies the Save command execution result.
    */
  /* CompleteClass */
  var Result: String = js.native
}
