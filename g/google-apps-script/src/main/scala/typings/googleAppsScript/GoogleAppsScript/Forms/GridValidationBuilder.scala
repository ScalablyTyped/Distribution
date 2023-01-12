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
  
  def build(): GridValidation
  
  def requireLimitOneResponsePerColumn(): GridValidationBuilder
}
object GridValidationBuilder {
  
  inline def apply(build: () => GridValidation, requireLimitOneResponsePerColumn: () => GridValidationBuilder): GridValidationBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), requireLimitOneResponsePerColumn = js.Any.fromFunction0(requireLimitOneResponsePerColumn))
    __obj.asInstanceOf[GridValidationBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridValidationBuilder] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: () => GridValidation): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setRequireLimitOneResponsePerColumn(value: () => GridValidationBuilder): Self = StObject.set(x, "requireLimitOneResponsePerColumn", js.Any.fromFunction0(value))
  }
}
