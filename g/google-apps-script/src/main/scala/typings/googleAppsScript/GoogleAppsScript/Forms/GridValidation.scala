package typings.googleAppsScript.GoogleAppsScript.Forms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A DataValidation for a GridItem.
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
// tslint:disable-next-line: no-empty-interface
@js.native
trait GridValidation extends StObject
