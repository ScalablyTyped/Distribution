package typings
package fundamentalDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var localizedText: js.UndefOr[Anon_Day1Sun] = js.undefined
  /* Additional props to be spread to the month's `<ul>` element. */
  var monthListProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* date */ stdLib.Date, scala.Unit]] = js.undefined
  /* Additional props to be spread to the `<tbody>` element. */
  var tableBodyProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* 'Additional props to be spread to the `<thead>` element.' */
  var tableHeaderProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the `<table>` element. */
  var tableProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the year's `<ul>` element. */
  var yearListProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object Anon_Date {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    localizedText: Anon_Day1Sun = null,
    monthListProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    onChange: /* date */ stdLib.Date => scala.Unit = null,
    tableBodyProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    tableHeaderProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    tableProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    yearListProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Date = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText)
    if (monthListProps != null) __obj.updateDynamic("monthListProps")(monthListProps)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (tableBodyProps != null) __obj.updateDynamic("tableBodyProps")(tableBodyProps)
    if (tableHeaderProps != null) __obj.updateDynamic("tableHeaderProps")(tableHeaderProps)
    if (tableProps != null) __obj.updateDynamic("tableProps")(tableProps)
    if (yearListProps != null) __obj.updateDynamic("yearListProps")(yearListProps)
    __obj.asInstanceOf[Anon_Date]
  }
}

