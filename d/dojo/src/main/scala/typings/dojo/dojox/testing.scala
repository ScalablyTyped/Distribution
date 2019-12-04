package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.testing")
@js.native
object testing extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/testing/DocTest.html
    *
    * This class executes doctests.
    * DocTests are tests that are defined inside the comment.
    * A doctest looks as if it was copied from the shell (which it mostly is).
    * A doctest is executed when the following conditions match:
    * 1) all lines are comments
    * 2) the line always starts with spaces/tabs followed by "//"
    *    and at least one space
    * 3) the line(s) of the test to execute starts with ">>>"
    *    preceeded by what is described in 2)
    * 4) the first line after 3) starting without ">>>" is the exptected result.
    *    preceeded by what is described in 2)
    * 5) the test sequence is terminated by an empty line, or the next
    *    test in the following line, or a new line that does not start as described in 2)
    *    (simple said: is not a comment)
    *    preceeded by what is described in 2)
    *
    * I.e. the following is a simple doctest, that will actually also be run
    * if you run this class against this file here:
    *
    *
    * 1+1 // A simple test case. Terminated by an empty line
    * 2
    *
    * 1==2
    * false
    * "a"+"b" // Also without the empty line before, this is a new test.
    * "ab"
    *
    * var anything = "anything" // Multiple commands for one test.
    * "something"==anything
    * false
    *
    *
    * DocTests are great for inline documenting a class or method, they also
    * are very helpful in understanding what the class/method actually does.
    * They don't make sense everywhere, but sometimes they are really handy.
    *
    */
  @js.native
  class DocTest () extends js.Object {
    /**
      *
      */
    var errors: js.Array[_] = js.native
    /**
      * Extract the tests from the given module or string.
      *
      * @param moduleName
      */
    def getTests(moduleName: String): js.Any = js.native
    /**
      *
      * @param data
      */
    def getTestsFromString(data: String): js.Any = js.native
    /**
      * Run the doctests in the module given.
      *
      * @param moduleName
      */
    def run(moduleName: js.Any): Unit = js.native
    /**
      *
      * @param commands
      * @param expected
      */
    def runTest(commands: js.Any, expected: js.Any): js.Object = js.native
  }
  
}

