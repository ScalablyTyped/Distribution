organization := "org.scalablytyped"
name := "devtools"
version := "7.25.1-f93a60"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-d881d1",
  "org.scalablytyped" %%% "devtools-protocol" % "0.0.1059612-10d27d",
  "org.scalablytyped" %%% "loglevel" % "1.8.0-cbcc55",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-0be45f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "puppeteer-core" % "19.0.0-6d729f",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "typescript" % "4.8.4-676e37",
  "org.scalablytyped" %%% "wdio__logger" % "7.19.0-ca3062",
  "org.scalablytyped" %%% "wdio__protocols" % "7.22.0-46c39a",
  "org.scalablytyped" %%% "wdio__types" % "7.25.1-9e2d80",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-a7f58f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
