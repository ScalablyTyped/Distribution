organization := "org.scalablytyped"
name := "dmg-license"
version := "1.0.11-8458e2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "iconv-corefoundation" % "1.1.7-34b026",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20220624Z-a72cbb",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "verror" % "1.10-dt-20220720Z-67ba3a",
  "org.scalablytyped" %%% "xmlbuilder" % "15.1.1-ea7341")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
