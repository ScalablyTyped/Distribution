package typings.googleAppsScript.GoogleAppsScript.Forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DataValidation for a CheckboxGridItem.
  *
  *     // Add a checkbox grid item to a form and require one response per column.
  *     var checkboxGridItem = form.addCheckboxGridItem();
  *     checkboxGridItem.setTitle('Where did you celebrate New Years?')
  *       .setRows(['New York', 'San Francisco', 'London'])
  *       .setColumns(['2014', '2015', '2016', '2017']);
  *     var checkboxGridValidation = FormApp.createCheckboxGridValidation()
  *       .setHelpText(“Select one item per column.”)
  *       .requireLimitOneResponsePerColumn()
  *       .build();
  *     checkboxGridItem.setValidation(checkboxGridValidation);
  */
// tslint:disable-next-line: no-empty-interface
@js.native
trait CheckboxGridValidation extends js.Object

