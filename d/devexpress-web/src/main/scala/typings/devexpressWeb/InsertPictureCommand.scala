package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a picture from a file.
  */
@js.native
trait InsertPictureCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertPictureCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param imageUrl A picture's URL.
    * @param callback A function to be executed after a picture is inserted. The interval parameter returns an Interval object that stores the inserted picture's length and position.
    */
  def execute(imageUrl: String): Boolean = js.native
  def execute(imageUrl: String, callback: js.Function1[/* interval */ Interval, Unit]): Boolean = js.native
}
