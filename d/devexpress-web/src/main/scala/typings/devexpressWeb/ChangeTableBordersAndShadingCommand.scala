package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change borders and shading of the selected table elements.
  */
@js.native
trait ChangeTableBordersAndShadingCommand extends js.Object {
  
  /**
    * Executes the ChangeTableBordersAndShadingCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableBorderSettings object with settings specifying table borders.
    * @param applyToWholeTable true to apply the border settings to the whole table, false to apply the border settings to the selected cells.
    */
  def execute(settings: TableBordersSettings, applyToWholeTable: Boolean): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableBordersSettings] = js.native
}
object ChangeTableBordersAndShadingCommand {
  
  @scala.inline
  def apply(
    execute: (TableBordersSettings, Boolean) => Boolean,
    getState: () => CommandState[TableBordersSettings]
  ): ChangeTableBordersAndShadingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTableBordersAndShadingCommand]
  }
  
  @scala.inline
  implicit class ChangeTableBordersAndShadingCommandOps[Self <: ChangeTableBordersAndShadingCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExecute(value: (TableBordersSettings, Boolean) => Boolean): Self = this.set("execute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[TableBordersSettings]): Self = this.set("getState", js.Any.fromFunction0(value))
  }
}
