package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IXTemplateParser extends IBase {
  /** [Method] This method is called to process lt tpl case action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doCase: js.UndefOr[
    js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl default gt */
  var doDefault: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] This method is called to process lt tpl else gt */
  var doElse: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] This method is called to process lt tpl elseif action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doElseIf: js.UndefOr[
    js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl gt
  		* @param type String The type of action that is being ended.
  		* @param actions Object The other actions keyed by the attribute name (such as 'exec').
  		*/
  var doEnd: js.UndefOr[
    js.Function2[
      /* type */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method is called to process text
  		* @param text String
  		*/
  var doEval: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] This method is called to process lt tpl exec action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name.
  		*/
  var doExec: js.UndefOr[
    js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method is called to process expressions like  expr
  		* @param expr String The body of the expression (inside "{[" and "]}").
  		*/
  var doExpr: js.UndefOr[js.Function1[/* expr */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] This method is called to process lt tpl for action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doFor: js.UndefOr[
    js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl foreach action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doForEach: js.UndefOr[
    js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl if action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doIf: js.UndefOr[
    js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl switch action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doSwitch: js.UndefOr[
    js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method is called to process simple tags like tag  */
  var doTag: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] This method is called to process a piece of raw text from the tpl
  		* @param text String
  		*/
  var doText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] This method is called to process an empty lt tpl gt */
  var doTpl: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Number) */
  var level: js.UndefOr[scala.Double] = js.undefined
}

