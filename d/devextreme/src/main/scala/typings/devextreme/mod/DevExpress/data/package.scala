package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Desc
import typings.devextreme.anon.SummaryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type FilterDescriptor = Any

type GroupDescriptor[T] = KeySelector[T] | (BaseGroupDescriptor[T] & Desc)

/**
  * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
  */
type KeySelector[T] = String | (js.Function1[/* source */ T, String | Double | js.Date | js.Object])

type SelectDescriptor[T] = String | js.Array[String] | (js.Function1[/* source */ T, Any])

type SortDescriptor[T] = GroupDescriptor[T]

type SummaryDescriptor[T] = KeySelector[T] | (BaseGroupDescriptor[T] & SummaryType)
