package typings.googleAppsScript.GoogleAppsScript.Forms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A DataValidationBuilder for a GridValidation.
  *
  *     // Add a grid item to a form and require one response per column.
  *     var gridItem = form.addGridItem();
  *     gridItem.setTitle('Rate your interests')
  *       .setRows(['Cars', 'Computers', 'Celebrities'])
  *       .setColumns(['Boring', 'So-so', 'Interesting']);
  *     var gridValidation = FormApp.createGridValidation()
  *       .setHelpText(“Select one item per column.”)
  *       .requireLimitOneResponsePerColumn()
  *       .build();
  *     gridItem.setValidation(gridValidation);
  */
trait GridValidationBuilder extends StObject {
  
  def requireLimitOneResponsePerColumn(): GridValidationBuilder
}
object GridValidationBuilder {
  
  @scala.inline
  def apply(requireLimitOneResponsePerColumn: () => GridValidationBuilder): GridValidationBuilder = {
    val __obj = js.Dynamic.literal(requireLimitOneResponsePerColumn = js.Any.fromFunction0(requireLimitOneResponsePerColumn))
    __obj.asInstanceOf[GridValidationBuilder]
  }
  
  @scala.inline
  implicit class GridValidationBuilderMutableBuilder[Self <: GridValidationBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequireLimitOneResponsePerColumn(value: () => GridValidationBuilder): Self = StObject.set(x, "requireLimitOneResponsePerColumn", js.Any.fromFunction0(value))
  }
}
