package typings
package domDashTestingDashLibraryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typingsQueriesMod {
  type AllByBoundAttribute = js.Function3[
    /* container */ stdLib.HTMLElement, 
    /* id */ domDashTestingDashLibraryLib.typingsMatchesMod.Matcher, 
    /* options */ js.UndefOr[domDashTestingDashLibraryLib.typingsMatchesMod.MatcherOptions], 
    js.Array[stdLib.HTMLElement]
  ]
  type AllByText = js.Function3[
    /* container */ stdLib.HTMLElement, 
    /* id */ domDashTestingDashLibraryLib.typingsMatchesMod.Matcher, 
    /* options */ js.UndefOr[domDashTestingDashLibraryLib.typingsQueryDashHelpersMod.SelectorMatcherOptions], 
    js.Array[stdLib.HTMLElement]
  ]
  type FindAllByBoundAttribute = js.Function4[
    /* container */ stdLib.HTMLElement, 
    /* id */ domDashTestingDashLibraryLib.typingsMatchesMod.Matcher, 
    /* options */ js.UndefOr[domDashTestingDashLibraryLib.typingsMatchesMod.MatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[
      domDashTestingDashLibraryLib.typingsWaitDashForDashElementMod.WaitForElementOptions
    ], 
    js.Promise[js.Array[stdLib.HTMLElement]]
  ]
  type FindAllByText = js.Function4[
    /* container */ stdLib.HTMLElement, 
    /* id */ domDashTestingDashLibraryLib.typingsMatchesMod.Matcher, 
    /* options */ js.UndefOr[domDashTestingDashLibraryLib.typingsQueryDashHelpersMod.SelectorMatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[
      domDashTestingDashLibraryLib.typingsWaitDashForDashElementMod.WaitForElementOptions
    ], 
    js.Promise[js.Array[stdLib.HTMLElement]]
  ]
  type FindByBoundAttribute = js.Function4[
    /* container */ stdLib.HTMLElement, 
    /* id */ domDashTestingDashLibraryLib.typingsMatchesMod.Matcher, 
    /* options */ js.UndefOr[domDashTestingDashLibraryLib.typingsMatchesMod.MatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[
      domDashTestingDashLibraryLib.typingsWaitDashForDashElementMod.WaitForElementOptions
    ], 
    js.Promise[stdLib.HTMLElement]
  ]
  type FindByText = js.Function4[
    /* container */ stdLib.HTMLElement, 
    /* id */ domDashTestingDashLibraryLib.typingsMatchesMod.Matcher, 
    /* options */ js.UndefOr[domDashTestingDashLibraryLib.typingsQueryDashHelpersMod.SelectorMatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[
      domDashTestingDashLibraryLib.typingsWaitDashForDashElementMod.WaitForElementOptions
    ], 
    js.Promise[stdLib.HTMLElement]
  ]
  type GetByBoundAttribute = js.Function3[
    /* container */ stdLib.HTMLElement, 
    /* id */ domDashTestingDashLibraryLib.typingsMatchesMod.Matcher, 
    /* options */ js.UndefOr[domDashTestingDashLibraryLib.typingsMatchesMod.MatcherOptions], 
    stdLib.HTMLElement
  ]
  type GetByText = js.Function3[
    /* container */ stdLib.HTMLElement, 
    /* id */ domDashTestingDashLibraryLib.typingsMatchesMod.Matcher, 
    /* options */ js.UndefOr[domDashTestingDashLibraryLib.typingsQueryDashHelpersMod.SelectorMatcherOptions], 
    stdLib.HTMLElement
  ]
  type QueryByBoundAttribute = js.Function3[
    /* container */ stdLib.HTMLElement, 
    /* id */ domDashTestingDashLibraryLib.typingsMatchesMod.Matcher, 
    /* options */ js.UndefOr[domDashTestingDashLibraryLib.typingsMatchesMod.MatcherOptions], 
    stdLib.HTMLElement | scala.Null
  ]
  type QueryByText = js.Function3[
    /* container */ stdLib.HTMLElement, 
    /* id */ domDashTestingDashLibraryLib.typingsMatchesMod.Matcher, 
    /* options */ js.UndefOr[domDashTestingDashLibraryLib.typingsQueryDashHelpersMod.SelectorMatcherOptions], 
    stdLib.HTMLElement | scala.Null
  ]
}
